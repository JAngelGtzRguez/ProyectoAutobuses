package com.autobuses.buscame;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
@EnableWs 
@Configuration
public class BuscameConf {
    @Bean
    public XsdSchema buscameSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("buscame.xsd"));
    }
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
        ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/autobuses/*");
    }
    @Bean(name = "buscame")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema buscameSchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("buscamePort");
        wsdl.setLocationUri("/autobuses");
        wsdl.setTargetNamespace("https://buscame.autobuses.com/buscame");
        wsdl.setSchema(buscameSchema);
        return wsdl;
    }
}