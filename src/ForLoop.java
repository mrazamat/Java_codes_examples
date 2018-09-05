public class ForLoop {
    public static void main(String[] args) {
        int size = 12;
        String path = "https://samdchti.uz/images/source/yangilklar/2018/09/05/01/";
        for (int i = 1; i < size; i++) {
            System.out.println("<p>" +
                    "<a href=\""  + path + i +".jpg\" data-fancybox=\"gallery\" >" +
                    "<img class=\"img-fluid\" alt=\"\" src=\"" + path + i +".jpg\" />" +
                    "</a>" +
                    "</p>\n");
        }
    }
}
