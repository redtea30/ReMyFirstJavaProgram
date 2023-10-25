<%@ page import="lombok.Data" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
<h2>Hello World!</h2>

<%

    class entity.Brand {
        //  这里省事省略private
        public String brand;
        public String advertisement;
        public String speakOut;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getAdvertisement() {
            return advertisement;
        }

        public void setAdvertisement(String advertisement) {
            this.advertisement = advertisement;
        }

        public String getSpeakOut() {
            return speakOut;
        }

        public void setSpeakOut(String speakOut) {
            this.speakOut = speakOut;
        }
    }
%>

<%
    entity.Brand user = new entity.Brand();
    user.setAdvertisement("电视");
    user.setBrand("立白");
    user.setSpeakOut("洗的又快又干净");

    entity.Brand user1 = new entity.Brand();
    user1.setAdvertisement("手机");
    user1.setBrand("小米");
    user1.setSpeakOut("高性价比，非常实用");

    entity.Brand user2 = new entity.Brand();
    user2.setAdvertisement("汽车");
    user2.setBrand("特斯拉");
    user2.setSpeakOut("驾驶体验极佳，电动环保");
%>

<table>
    <tr>
        <td>广告</td>
        <td>口号</td>
        <td>企业名称</td>

    </tr>
    <%
        // 头
        StringBuffer html = new StringBuffer("<tr>");

        html.append("<td>" + user.getAdvertisement() + "</td><td>").append(user.getSpeakOut() + "</td><td>").append(user.getBrand() + "</tr><tr>");
        html.append("<td>" + user1.getAdvertisement() + "</td><td>").append(user1.getSpeakOut() + "</td><td>").append(user1.getBrand() + "</tr><tr>");
        html.append("<td>" + user2.getAdvertisement() + "</td><td>").append(user2.getSpeakOut() + "</td><td>").append(user2.getBrand() + "</tr>");

        out.print(html.toString());
    %>

</table>


</body>
</html>
