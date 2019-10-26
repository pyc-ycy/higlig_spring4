//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:AwareService.java
// @User:彭友聪
//@Date:2019/10/26
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.aware;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader){
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
    public void outputResult(){
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = loader.getResource("classpath:./test.txt");
        try{
            System.out.println("ResourceLoader加载的内容为：" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
