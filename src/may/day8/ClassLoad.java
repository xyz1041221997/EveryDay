package may.day8;

import static java.lang.Class.forName;

public class ClassLoad {
    public static void main(String[] args) {
        try{
            /**
             * 第一种方法反射
             */
              Class<?> forName  =  Class.forName("may.day8.Classdemo");
              Object name = forName.newInstance();
              Classdemo demo = (Classdemo) name;
            demo.setName("账上");
              System.out.println(demo.getName());
//              System.out.println(Classdemo.s);
            /**
             * 第二种方法反射
             */
                ClassLoader loader = Classdemo.class.getClassLoader();
                System.out.println(loader);
        }catch(Exception e){

        }

    }
}
