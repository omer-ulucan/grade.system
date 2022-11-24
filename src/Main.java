import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student ogr1 = new Student("Chad Acosta",1946);
        Lesson les1 = new Lesson("Math",75,55);
        Lesson les2 = new Lesson("Physics",25,25);
        int aver1 = (les1.getExam1()+ les1.getExam2())/2;
        int aver2 = ( les2.getExam1()+ les2.getExam2())/2;
        int averOgr1 = (aver1+aver2)/2;
        Student ogr2 = new Student("Felicia Anderson",1534);
        Lesson les3 = new Lesson("Chemistry",50,40);
        Lesson les4 = new Lesson("Physics",25,65);
        int aver3 = (les3.getExam1()+ les3.getExam2())/2;
        int aver4 = (les4.getExam1()+ les4.getExam2())/2;
        int averOgr2 = (aver3+aver4)/2;
        Student ogr3 = new Student("Carl Johnson",1792);
        Lesson les5 = new Lesson("Chemistry",65,45);
        Lesson les6 = new Lesson("Math",40,60);
        int aver5 = (les5.getExam1()+ les5.getExam2())/2;
        int aver6 = (les6.getExam1()+ les6.getExam2())/2;
        int averOgr3 = (aver5+aver6)/2;
        Student ogr4 = new Student("Rose Clagg",1342);
        Lesson les7 = new Lesson("Physics",15,25);
        Lesson les8 = new Lesson("Biology",15,25);
        int aver7 =(les7.getExam1()+ les7.getExam2())/2;
        int aver8 =(les8.getExam1()+ les8.getExam2())/2;
        int averOgr4 = (aver7+aver8)/2;
        Student ogr5= new Student("Zoe Guevara",1683);
        Lesson les9 = new Lesson("Chemistry",70,60);
        Lesson les10 = new Lesson("Biology",80,70);
        int aver9 =(les9.getExam1()+les9.getExam2())/2;
        int aver10=(les10.getExam1()+les10.getExam2())/2;
        int averOgr5 = (aver9+aver10)/2;
        Student ogr6 = new Student("Bradley Mackay", 1854);
        Lesson les11 = new Lesson("Math",35,65);
        Lesson les12 = new Lesson("Biology",45,35);
        int aver11 = (les11.getExam1()+ les11.getExam2())/2;
        int aver12 = (les12.getExam1()+ les12.getExam2())/2;
        int averOgr6 = (aver11+aver12)/2;

        int averMath = (aver1+aver6+aver11)/3;
        int averPhy = (aver2+aver4+aver7)/3;
        int averBio = (aver8+aver10+aver12)/3;
        int averChe = (aver3+aver5+aver9)/3;
        int averTotal = (averMath+averPhy+averBio+averChe)/4;

        int x = 9;



        while(true){
            System.out.println("Please Enter Your ID : ");
            int ogrId = scanner.nextInt();
            scanner.nextLine();
            if(ogrId==1946){
                System.out.println("Please Select a process : \n1-COMPARE THE AVERAGE\n2-OVERALL SCORE\n3-STUDENT INFORMATION\nPRESS Q FOR EXIT");
                String process = scanner.nextLine();
                if (process.equals("1")) {
                    if (averOgr1 < averTotal) {
                        System.out.println("Your average is below the overall average.");
                        System.out.println("Your Average : " + averOgr1);
                        System.out.println("Overall Average : " + averTotal);

                    } else if (averTotal < averOgr1) {
                        System.out.println("Your average is above the overall average.");
                        System.out.println("Your Average : " + averOgr1);
                        System.out.println("Overall Average : " + averTotal);
                    }
                }
                if(process.equals("2")) {
                    if (averOgr1 < averTotal - x) {
                        System.out.println("Your score : FF");
                    } else if (averOgr1 >= averTotal - x && averOgr1 < averTotal) {
                        System.out.println("Your Score : DD");
                    } else if (averOgr1 >= averTotal && averOgr1 < averTotal + x) {
                        System.out.println("Your Score : CD");
                    } else if (averOgr1 >= averTotal + x && averOgr1 < averTotal + (2 * x)) {
                        System.out.println("You Score : CC");
                    } else if (averOgr1 >= averTotal + (2 * x) && averOgr1 < averTotal + (3 * x)) {
                        System.out.println("Your Score : BC");
                    } else if (averOgr1 >= averTotal + (3 * x) && averOgr1 < averTotal + (4 * x)) {
                        System.out.println("Your Score : BB");
                    } else if (averOgr1 >= averTotal + (4 * x) && averOgr1 < averTotal + (5 * x)) {
                        System.out.println("Your Score : AB");
                    } else if (averOgr1 >= averTotal + (5 * x) && averOgr1 < averTotal + (6 * x)) {
                        System.out.println("Your Score : AA");
                    }
                }
                if (process.equals("3")){
                    System.out.println("Student Name : "+ogr1.getName());
                    System.out.println("Studen ID : "+ogr1.getId());
                    System.out.println("Your "+les1.getLessonType()+" Average : "+aver1);
                    System.out.println("Your "+les2.getLessonType()+ " Average : "+aver2);
                }
                if (process.equals("q")){
                    System.out.println("EXITING THE SYSTEM....");
                    break;
                }
            }

            else if(ogrId==1534){
                System.out.println("Please Select a process : \n1-COMPARE THE AVERAGE\n2-OVERALL SCORE\n3-STUDENT INFORMATION\nPRESS Q FOR EXIT");
                String process = scanner.nextLine();
                if (process.equals("1")) {
                    if (averOgr2 < averTotal) {
                        System.out.println("Your average is below the overall average.");
                        System.out.println("Your Average : " + averOgr2);
                        System.out.println("Overall Average : " + averTotal);

                    } else if (averTotal < averOgr2) {
                        System.out.println("Your average is above the overall average.");
                        System.out.println("Your Average : " + averOgr2);
                        System.out.println("Overall Average : " + averTotal);
                    }
                }
                if(process.equals("2")) {
                    if (averOgr2 < averTotal - x) {
                        System.out.println("Your score : FF");
                    } else if (averOgr2 >= averTotal - x && averOgr2 < averTotal) {
                        System.out.println("Your Score : DD");
                    } else if (averOgr2 >= averTotal && averOgr2 < averTotal + x) {
                        System.out.println("Your Score : CD");
                    } else if (averOgr2 >= averTotal + x && averOgr2 < averTotal + (2 * x)) {
                        System.out.println("You Score : CC");
                    } else if (averOgr2 >= averTotal + (2 * x) && averOgr2 < averTotal + (3 * x)) {
                        System.out.println("Your Score : BC");
                    } else if (averOgr2 >= averTotal + (3 * x) && averOgr2 < averTotal + (4 * x)) {
                        System.out.println("Your Score : BB");
                    } else if (averOgr2 >= averTotal + (4 * x) && averOgr2 < averTotal + (5 * x)) {
                        System.out.println("Your Score : AB");
                    } else if (averOgr2 >= averTotal + (5 * x) && averOgr2 < averTotal + (6 * x)) {
                        System.out.println("Your Score : AA");
                    }
                }
                if (process.equals("3")){
                    System.out.println("Student Name : "+ogr2.getName());
                    System.out.println("Studen ID : "+ogr2.getId());
                    System.out.println("Your "+les3.getLessonType()+" Score : "+aver3);
                    System.out.println("Your "+les4.getLessonType()+ " Score : "+aver4);
                }
                if (process.equals("q")){
                    System.out.println("EXITING THE SYSTEM....");
                }
            }
            else if(ogrId==1792){
                System.out.println("Please Select a process : \n1-COMPARE THE AVERAGE\n2-OVERALL SCORE\n3-STUDENT INFORMATION\nPRESS Q FOR EXIT");
                String process = scanner.nextLine();
                if (process.equals("1")) {
                    if (averOgr3 < averTotal) {
                        System.out.println("Your average is below the overall average.");
                        System.out.println("Your Average : " + averOgr3);
                        System.out.println("Overall Average : " + averTotal);

                    } else if (averTotal < averOgr3) {
                        System.out.println("Your average is above the overall average.");
                        System.out.println("Your Average : " + averOgr3);
                        System.out.println("Overall Average : " + averTotal);
                    }
                }
                if(process.equals("2")) {
                    if (averOgr3 < averTotal - x) {
                        System.out.println("Your score : FF");
                    } else if (averOgr3 >= averTotal - x && averOgr3 < averTotal) {
                        System.out.println("Your Score : DD");
                    } else if (averOgr3 >= averTotal && averOgr3 < averTotal + x) {
                        System.out.println("Your Score : CD");
                    } else if (averOgr3 >= averTotal + x && averOgr3 < averTotal + (2 * x)) {
                        System.out.println("You Score : CC");
                    } else if (averOgr3 >= averTotal + (2 * x) && averOgr3 < averTotal + (3 * x)) {
                        System.out.println("Your Score : BC");
                    } else if (averOgr3 >= averTotal + (3 * x) && averOgr3 < averTotal + (4 * x)) {
                        System.out.println("Your Score : BB");
                    } else if (averOgr3 >= averTotal + (4 * x) && averOgr3 < averTotal + (5 * x)) {
                        System.out.println("Your Score : AB");
                    } else if (averOgr3 >= averTotal + (5 * x) && averOgr3 < averTotal + (6 * x)) {
                        System.out.println("Your Score : AA");
                    }
                }
                if (process.equals("3")){
                    System.out.println("Student Name : "+ogr3.getName());
                    System.out.println("Studen ID : "+ogr3.getId());
                    System.out.println("Your "+les5.getLessonType()+" Score : "+aver5);
                    System.out.println("Your "+les6.getLessonType()+ " Score : "+aver6);
                }
                if (process.equals("q")){
                    System.out.println("EXITING THE SYSTEM....");
                    break;
                }

            }
            else if(ogrId==1342){
                System.out.println("Please Select a process : \n1-COMPARE THE AVERAGE\n2-OVERALL SCORE\n3-STUDENT INFORMATION\nPRESS Q FOR EXIT");
                String process = scanner.nextLine();
                if (process.equals("1")) {
                    if (averOgr4 < averTotal) {
                        System.out.println("Your average is below the overall average.");
                        System.out.println("Your Average : " + averOgr4);
                        System.out.println("Overall Average : " + averTotal);

                    } else if (averTotal < averOgr4) {
                        System.out.println("Your average is above the overall average.");
                        System.out.println("Your Average : " + averOgr4);
                        System.out.println("Overall Average : " + averTotal);
                    }
                }
                if(process.equals("2")) {
                    if (averOgr4 < averTotal - x) {
                        System.out.println("Your score : FF");
                    } else if (averOgr4 >= averTotal - x && averOgr4 < averTotal) {
                        System.out.println("Your Score : DD");
                    } else if (averOgr4 >= averTotal && averOgr4 < averTotal + x) {
                        System.out.println("Your Score : CD");
                    } else if (averOgr4 >= averTotal + x && averOgr4 < averTotal + (2 * x)) {
                        System.out.println("You Score : CC");
                    } else if (averOgr4 >= averTotal + (2 * x) && averOgr4 < averTotal + (3 * x)) {
                        System.out.println("Your Score : BC");
                    } else if (averOgr4 >= averTotal + (3 * x) && averOgr4 < averTotal + (4 * x)) {
                        System.out.println("Your Score : BB");
                    } else if (averOgr4 >= averTotal + (4 * x) && averOgr4 < averTotal + (5 * x)) {
                        System.out.println("Your Score : AB");
                    } else if (averOgr4 >= averTotal + (5 * x) && averOgr4 < averTotal + (6 * x)) {
                        System.out.println("Your Score : AA");
                    }
                }
                if (process.equals("3")){
                    System.out.println("Student Name : "+ogr4.getName());
                    System.out.println("Studen ID : "+ogr4.getId());
                    System.out.println("Your "+les7.getLessonType()+" Score : "+aver7);
                    System.out.println("Your "+les8.getLessonType()+ " Score : "+aver8);
                }
                if (process.equals("q")){
                    System.out.println("EXITING THE SYSTEM....");
                    break;
                }

            }
            else if(ogrId==1683){
                System.out.println("Please Select a process : \n1-COMPARE THE AVERAGE\n2-OVERALL SCORE\n3-STUDENT INFORMATION\nPRESS Q FOR EXIT");
                String process = scanner.nextLine();
                if (process.equals("1")) {
                    if (averOgr5 < averTotal) {
                        System.out.println("Your average is below the overall average.");
                        System.out.println("Your Average : " + averOgr5);
                        System.out.println("Overall Average : " + averTotal);

                    } else if (averTotal < averOgr5) {
                        System.out.println("Your average is above the overall average.");
                        System.out.println("Your Average : " + averOgr5);
                        System.out.println("Overall Average : " + averTotal);
                    }
                }
                if(process.equals("2")) {
                    if (averOgr5 < averTotal - x) {
                        System.out.println("Your score : FF");
                    } else if (averOgr5 >= averTotal - x && averOgr5 < averTotal) {
                        System.out.println("Your Score : DD");
                    } else if (averOgr5 >= averTotal && averOgr5 < averTotal + x) {
                        System.out.println("Your Score : CD");
                    } else if (averOgr5 >= averTotal + x && averOgr5 < averTotal + (2 * x)) {
                        System.out.println("You Score : CC");
                    } else if (averOgr5 >= averTotal + (2 * x) && averOgr5 < averTotal + (3 * x)) {
                        System.out.println("Your Score : BC");
                    } else if (averOgr5 >= averTotal + (3 * x) && averOgr5 < averTotal + (4 * x)) {
                        System.out.println("Your Score : BB");
                    } else if (averOgr5 >= averTotal + (4 * x) && averOgr5 < averTotal + (5 * x)) {
                        System.out.println("Your Score : AB");
                    } else if (averOgr5 >= averTotal + (5 * x) && averOgr5 < averTotal + (6 * x)) {
                        System.out.println("Your Score : AA");
                    }
                }
                if (process.equals("3")){
                    System.out.println("Student Name : "+ogr5.getName());
                    System.out.println("Studen ID : "+ogr5.getId());
                    System.out.println("Your "+les9.getLessonType()+" Score : "+aver9);
                    System.out.println("Your "+les10.getLessonType()+ " Score : "+aver10);
                }
                if (process.equals("q")){
                    System.out.println("EXITING THE SYSTEM....");
                    break;
                }

            }
            else if(ogrId==1854){
                System.out.println("Please Select a process : \n1-COMPARE THE AVERAGE\n2-OVERALL SCORE\n3-STUDENT INFORMATION\nPRESS Q FOR EXIT");
                String process = scanner.nextLine();
                if (process.equals("1")) {
                    if (averOgr6 < averTotal) {
                        System.out.println("Your average is below the overall average.");
                        System.out.println("Your Average : " + averOgr6);
                        System.out.println("Overall Average : " + averTotal);

                    } else if (averTotal < averOgr6) {
                        System.out.println("Your average is above the overall average.");
                        System.out.println("Your Average : " + averOgr6);
                        System.out.println("Overall Average : " + averTotal);
                    }
                }
                if(process.equals("2")) {
                    if (averOgr6 < averTotal - x) {
                        System.out.println("Your score : FF");
                    } else if (averOgr6 >= averTotal - x && averOgr6 < averTotal) {
                        System.out.println("Your Score : DD");
                    } else if (averOgr6 >= averTotal && averOgr6 < averTotal + x) {
                        System.out.println("Your Score : CD");
                    } else if (averOgr6 >= averTotal + x && averOgr6 < averTotal + (2 * x)) {
                        System.out.println("You Score : CC");
                    } else if (averOgr6 >= averTotal + (2 * x) && averOgr6 < averTotal + (3 * x)) {
                        System.out.println("Your Score : BC");
                    } else if (averOgr6 >= averTotal + (3 * x) && averOgr6 < averTotal + (4 * x)) {
                        System.out.println("Your Score : BB");
                    } else if (averOgr6 >= averTotal + (4 * x) && averOgr6 < averTotal + (5 * x)) {
                        System.out.println("Your Score : AB");
                    } else if (averOgr6 >= averTotal + (5 * x) && averOgr6 < averTotal + (6 * x)) {
                        System.out.println("Your Score : AA");
                    }
                }
                if (process.equals("3")){
                    System.out.println("Student Name : "+ogr6.getName());
                    System.out.println("Studen ID : "+ogr6.getId());
                    System.out.println("Your "+les11.getLessonType()+" Score : "+aver11);
                    System.out.println("Your "+les12.getLessonType()+ " Score : "+aver12);
                }
                if (process.equals("q")){
                    System.out.println("EXITING THE SYSTEM....");
                    break;
                }
            }
            else {
                System.out.println("Please enter defined ID....");
            }
        }
    }
}