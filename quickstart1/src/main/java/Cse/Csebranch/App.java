package Cse.Csebranch;//XML
/* BY using setter and constructor we can inject data
 * setter we use properties
 * constructor we use constructor-arg
 * step2:we use bean in config <bean  name="pakage"  value="student><property> or <constructor></bean>
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext cse=new ClassPathXmlApplicationContext("config.xml");
       csedata cd=(csedata)cse.getBean("student1");
       System.out.println(cd);
       itdata m=(itdata)cse.getBean("student2");
       System.out.println(m);
       aimldata ad=(aimldata)cse.getBean("student3");
       System.out.println(ad);
       
       /*cd.disp();
        itdata id=(itdata)cse.getBean("student2");
        id.rocks();
        csemain m=(csemain)cse.getBean("main");
        m.mine();
        */
       
    }
    

}
