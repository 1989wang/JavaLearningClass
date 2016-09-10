
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float score=67.4f;
        String name="XiaoMing";
        String sex="male";
        char degree='A';
        int age=23;
        final double PI =3.1415926;
        System.out.println("JAVA考试最高分数:"+score);
        System.out.println("等级:"+degree);
        System.out.println("姓名:"+name);
        System.out.println("性别:"+sex);
        System.out.println("年龄:"+age);
        System.out.println("PI是多少？=:"+PI);
        System.out.println("5/2="+(5/2)+"\t5%2="+(5%2));

        if (score>=90){
            if (sex=="male") {
                System.out.println("男学霸");
            }else{
                System.out.println("女学霸");
            }
        }else{
            if (sex=="male") {
                System.out.println("男学渣");
            }else{
                System.out.println("女学渣");
            }
        }
        System.out.println("___________________________________________________________________________");
        switch (sex) {
            case "male":
                System.out.println(name+"是男生");
                break;
            case "female":
                System.out.println(name+"我是女生");
                break;
            default:

        }

        System.out.println("WTK");

        System.out.print("Enter a Char:");
//        Scanner scan = new Scanner(System.in);
        String read = new Scanner(System.in ).nextLine();
        System.out.println("your char is :"+read);

    }
}
