public class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入性別，男性輸入1，女性輸入2");
        int sex = sc.nextInt();
        int sex2 = sex % 2;
        if (sex2 == 1) {
            System.out.println("請輸入身高");
            int x = sc.nextInt();
            double y = (x - 80) * 70 / 100;

            System.out.println("理想體重:" + y + "公斤");
            double a = y + y * 20 / 100;
            double b = y + y * 10 / 100;
            double c = y - y * 10 / 100;
            double d = y - y * 20 / 100;
            System.out.println("肥胖:" + a + "公斤以上");
            System.out.println("過重:" + b + "公斤以上");
            System.out.println("標準:" + c + "~" + b + "公斤");
            System.out.println("過輕:" + c + "公斤以下");
            System.out.println("體重不足:" + d + "公斤以下");

        } else
            System.out.println("請輸入身高");
        int fx = sc.nextInt();
        double fy = (fx - 70) * 60 / 100;
        System.out.println("理想體重:" + fy + "公斤");

        double a = fy + fy * 20 / 100;
        double b = fy + fy * 10 / 100;
        double c = fy - fy * 10 / 100;
        double d = fy - fy * 20 / 100;
        System.out.println("肥胖:" + a + "公斤以上");
        System.out.println("過重:" + b + "公斤以上");
        System.out.println("標準:" + c + "~" + b + "公斤");
        System.out.println("過輕:" + c + "公斤以下");
        System.out.println("體重不足:" + d + "公斤以下");


    }
}

