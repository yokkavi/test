package test;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.kohsuke.args4j.Option;
 
public class Args4jTest  {
 
    @Option(name = "--testng", usage = "Set connection user name", required = true)
    private String name;
 
    @Option(name = "--url", usage = "Set connection user password", required = true)
    private String password;
 
//    @Option(name = "--charset", usage = "Set connection charset")
//    private String charset;
// 
//    @Option(name = "--url", usage = "Set connection url")
//    private String url;
// 
//    @Option(name = "--config", usage = "Additional config options")
//    private File config;

 
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
    

}
