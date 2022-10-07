package com.liwc.webapp;
import com.liwc.servlet.HeroRequest;
import com.liwc.servlet.HeroResponse;
import com.liwc.servlet.HeroServlet;

public class HelloServlet extends HeroServlet {
    @Override
    public void doGet(HeroRequest heroRequest, HeroResponse heroResponse) throws Exception {
        String uri=heroRequest.getUri();
        String method=heroRequest.getMethod();
        String path=heroRequest.getPath();
        String name=heroRequest.getParameter("name");
        heroResponse.write("uri="+uri+"\n"+
                "path="+path+"\n"+
                "param="+name+"\n"+
                "method="+method+"\n");
    }

    @Override
    public void doPost(HeroRequest heroRequest, HeroResponse heroResponse) throws Exception {
        doGet(heroRequest, heroResponse);
    }
}
