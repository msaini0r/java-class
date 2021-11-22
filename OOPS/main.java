
//Important Point: Class is used to create our own datatype(to store our data like name,roll,marks)
package OOPS;

    public class main {
        public static void main(String[] args) {
            // store 5 roll nos
            int[] numbers = new int[5];

            // store 5 names
            String[] names = new String[5];

            // data of 5 students: {roll no, name, marks}
            int[] rno = new int[5];
            String[] name = new String[5];
            float[] marks = new float[5];

            Student[] students = new Student[5];

            // just declaring
       Student kunal = new Student(21,"raman",85.4f);
            Student anuj = new Student();
       //Kunal is refernce variable.
            //new is basically
            //Student() is the constructor


// we can do this step in constructor instead of doing it here.
//        kunal.rno = 13;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 88.5f;

//            kunal.changeName("Volleyball lover");
//            kunal.greeting();
            System.out.println(kunal.rno);
            System.out.println(kunal.name);
            System.out.println(kunal.marks);

        }
    }

    // create a class
// for every single student
    class Student {
        int rno;
        String name;
        float marks;

// we can alse add functions to the classes also.
 // lets create a function greeting.
        void greeting(){
           // we are using this keyword because it help us to get the reference variable(here like Kunal) from the class.
            System.out.println("Hello!! My name is " + this.name);
        }

        void changeName(String newName){
            name = newName;
        }


        // we need a way to add the values of the above properties object by object.
        // we need one word(which is this keyword) to access every object.
        Student () {
            //we ar using this instead of kunal which is similar for the fact tha we need one word to represent all obejct.
         //   kunal.no = 13;
            this.rno = 13;
            this.name = "Mohit Saini";
            this.marks = 85.4f;
        }
        Student (int rno,String name,float marks) {
            rno = 13;
            name = "Mohit Saini";
            marks = 85.4f;
        }
    }






