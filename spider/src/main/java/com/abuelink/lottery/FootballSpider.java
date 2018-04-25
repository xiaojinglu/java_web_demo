package com.abuelink.lottery;

import com.abuelink.lottery.model.vo.spider.FootballGameSpiderDto;
import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.nodes.TagNode;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * \* User: xjlu@iflytek.com
 * \* Date: 2018/3/19
 * \* Time: 17:46
 * \* Description:
 * \
 */
public class FootballSpider {

    ArrayList<FootballGameSpiderDto> flist = new ArrayList();

    public FootballSpider() {
    }

    protected void parse(String date) {
        try {
            String e = "http://caipiao.163.com/order/jczq-hunhe/?betDate=" + date;
            NodeList nodeList = null;
            Parser parser = new Parser(e);
            parser.setEncoding("UTF-8");
            nodeList = parser.parse(new NodeFilter() {
                @Override
                public boolean accept(Node node) {
                    return node.getText().contains("gameDate");
                }
            });
            Node[] nodeArray = nodeList.toNodeArray();

            for(int i = 0; i < nodeArray.length; ++i) {
                Node node = nodeArray[i];
                if(node.getChildren() != null) {
                    NodeList childList = node.getChildren().extractAllNodesThatMatch(new NodeFilter() {
                        @Override
                        public boolean accept(Node node) {
                            return node.getText().contains("dd");
                        }
                    });
                    Node[] nodes = childList.toNodeArray();

                    for(int j = 0; j < nodes.length; j =j+2) {
                        TagNode tag1 = (TagNode)nodes[j];
                        TagNode tag2 = (TagNode)nodes[j + 1];
                        FootballGameSpiderDto fbg1 = this.solveTag1(tag1);
                        if(!fbg1.getIsStop().contains("1")) {
                            FootballGameSpiderDto fbg2 = this.solveTag2(tag2);
                            FootballGameSpiderDto fbg = new FootballGameSpiderDto(fbg1, fbg2);
                            this.flist.add(fbg);
                        }
                    }
                }
            }
        } catch (ParserException exception) {
            exception.printStackTrace();
        }

    }

    public FootballGameSpiderDto solveTag1(TagNode tag) {
        FootballGameSpiderDto fbg = new FootballGameSpiderDto();
        fbg.setIsStop(tag.getAttribute("isStop"));
        fbg.setMatchCode(tag.getAttribute("matchcode"));
        fbg.setMatchnumcn(tag.getAttribute("matchnumcn"));
        fbg.setStartTime(new Date(Long.parseLong(tag.getAttribute("starttime"))));
        fbg.setEndTime(new Date(Long.parseLong(tag.getAttribute("endtime"))));
        fbg.setHostName(tag.getAttribute("hostname"));
        fbg.setGuestName(tag.getAttribute("guestname"));
        fbg.setLeagueID(tag.getAttribute("leagueid"));
        fbg.setHostTeamID(tag.getAttribute("hostteamid"));
        fbg.setVisitTeamID(tag.getAttribute("visitteamid"));
        fbg.setMatchID(tag.getAttribute("matchid"));
        fbg.setLeagueName(tag.getAttribute("leaguename"));
        fbg.setCls(tag.getAttribute("class"));
        NodeList nodeList;
        if(tag.getChildren() != null) {
            nodeList = tag.getChildren().extractAllNodesThatMatch(new NodeFilter() {
                public boolean accept(Node node) {
                    return node.getText().contains("class=\"c_939393\"");
                }
            }, true);
            Node[] nodeArray = nodeList.toNodeArray();
            fbg.setHostInt(nodeArray[0].getNextSibling().getText());
            fbg.setVisitInt(nodeArray[1].getNextSibling().getText());
        }

        nodeList = null;
        NodeList nodeList1 = null;
        if(tag.getChildren() != null) {
            nodeList = tag.getChildren().extractAllNodesThatMatch(new NodeFilter() {
                public boolean accept(Node node) {
                    return node.getText().contains("class=\"line1");
                }
            }, true);
        }

        if(tag.getChildren() != null) {
            nodeList1 = tag.getChildren().extractAllNodesThatMatch(new NodeFilter() {
                public boolean accept(Node node) {
                    return node.getText().contains("class=\"line2");
                }
            }, true);
        }

        NodeList nodeListChild1 = null;
        NodeList nodeListChild2 = null;
        if(nodeList != null && nodeList.size() > 0) {
            nodeListChild1 = nodeList.elementAt(0).getChildren().extractAllNodesThatMatch(new NodeFilter() {
                public boolean accept(Node node) {
                    return node.getText().contains("em index");
                }
            });
        }

        if(nodeList1 != null && nodeList1.size() > 0) {
            nodeListChild2 = nodeList1.elementAt(0).getChildren().extractAllNodesThatMatch(new NodeFilter() {
                public boolean accept(Node node) {
                    return node.getText().contains("em index");
                }
            });
        }

        Node[] nodeListChildArray;
        TagNode tagrq;
        if(nodeListChild1 != null) {
            nodeListChildArray = nodeListChild1.toNodeArray();
            for(int i = 0; i < nodeListChildArray.length; ++i) {
                tagrq = (TagNode)nodeListChildArray[i];
                fbg.getRq0().add(tagrq.getAttribute("sp"));
            }
        }
        if(nodeListChild2 != null) {
            nodeListChildArray = nodeListChild2.toNodeArray();
            for(int i = 0; i < nodeListChildArray.length; ++i) {
                tagrq = (TagNode)nodeListChildArray[i];
                fbg.getRq1().add(tagrq.getAttribute("sp"));
            }
        }

        return fbg;
    }

    public FootballGameSpiderDto solveTag2(TagNode tag) {
        FootballGameSpiderDto fbg = new FootballGameSpiderDto();
        if(tag.getChildren() != null) {
            Node[] rows = tag.getChildren().extractAllNodesThatMatch(new NodeFilter() {
                @Override
                public boolean accept(Node node) {
                    return node.getText().contains("tr");
                }
            }, true).toNodeArray();
            ArrayList buffered = new ArrayList();

            for(int dataBuffer = 0; dataBuffer < rows.length; ++dataBuffer) {
                if(rows[dataBuffer].getChildren() != null) {
                    buffered.add(rows[dataBuffer].getChildren().extractAllNodesThatMatch(new NodeFilter() {
                        @Override
                        public boolean accept(Node node) {
                            return node.getText().contains("td sp");
                        }
                    }).toNodeArray());
                }
            }

            ArrayList<ArrayList<String>> arrayList = new ArrayList();

            for(int i = 0; i < buffered.size(); i++) {
                arrayList.add(new ArrayList());
                Node[] td = (Node[])buffered.get(i);

                for(int j = 0; j < td.length; j++) {
                    Node tagTd = td[j];
                    String sp = ((TagNode)tagTd).getAttribute("sp");
                    ((ArrayList)arrayList.get(i)).add(sp);
                }
            }

            fbg.getHalfOrFull().addAll((Collection)arrayList.get(0));

            for(int i = 1; i <= 3; i++) {
                fbg.getScore1().add(arrayList.get(i));
            }

            fbg.getScore2().addAll((Collection)arrayList.get(4));
        }

        return fbg;
    }

}