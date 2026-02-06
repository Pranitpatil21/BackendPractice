package in.sp.beans.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("in.sp.beans")  // it will find the component and after that it will creates its object and initilize values
//@ComponentScan({"in.sp.beans","----- ","--------- " }) //by this way we can use multiple package
@ComponentScan(basePackages = {"in.sp.beans"})
public class SpringConfigFile {

}
