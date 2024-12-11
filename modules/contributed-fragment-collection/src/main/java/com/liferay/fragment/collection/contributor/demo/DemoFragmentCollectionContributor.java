package com.liferay.fragment.collection.contributor.demo;

import com.liferay.fragment.contributor.BaseFragmentCollectionContributor;
import com.liferay.fragment.contributor.FragmentCollectionContributor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import javax.servlet.ServletContext;

@Component(
        property = "fragment.collection.key=demo",
        service = FragmentCollectionContributor.class
)
public class DemoFragmentCollectionContributor extends BaseFragmentCollectionContributor {

    @Reference(
            target = "(osgi.web.symbolicname=com.liferay.fragment.collection.contributor.demo)"
    )
    private ServletContext _servletContext;

    @Override
    public String getFragmentCollectionKey() {return "demo";}

    @Override
    public ServletContext getServletContext() {
        return _servletContext;
    }
}

