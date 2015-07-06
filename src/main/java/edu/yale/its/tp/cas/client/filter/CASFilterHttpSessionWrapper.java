package edu.yale.its.tp.cas.client.filter;

import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

public class CASFilterHttpSessionWrapper
  implements HttpSession
{
  HttpSession wrappedSession;
  
  public CASFilterHttpSessionWrapper(HttpSession wrappedSession)
  {
    this.wrappedSession = wrappedSession;
  }
  
  public Object getAttribute(String arg0)
  {
    return this.wrappedSession.getAttribute(arg0);
  }
  
  public Enumeration getAttributeNames()
  {
    return this.wrappedSession.getAttributeNames();
  }
  
  public long getCreationTime()
  {
    return this.wrappedSession.getCreationTime();
  }
  
  public String getId()
  {
    return this.wrappedSession.getId();
  }
  
  public long getLastAccessedTime()
  {
    return this.wrappedSession.getLastAccessedTime();
  }
  
  public int getMaxInactiveInterval()
  {
    return this.wrappedSession.getMaxInactiveInterval();
  }
  
  public ServletContext getServletContext()
  {
    return this.wrappedSession.getServletContext();
  }
  
  public HttpSessionContext getSessionContext()
  {
    return this.wrappedSession.getSessionContext();
  }
  
  public Object getValue(String arg0)
  {
    return this.wrappedSession.getValue(arg0);
  }
  
  public String[] getValueNames()
  {
    return this.wrappedSession.getValueNames();
  }
  
  public boolean isNew()
  {
    return this.wrappedSession.isNew();
  }
  
  public void setMaxInactiveInterval(int arg0)
  {
    this.wrappedSession.setMaxInactiveInterval(arg0);
  }
  
  public void invalidate() {}
  
  public void putValue(String arg0, Object arg1)
  {
    if ((arg0 != null) && (arg0.startsWith("edu.yale"))) {
      return;
    }
    this.wrappedSession.putValue(arg0, arg1);
  }
  
  public void removeAttribute(String arg0)
  {
    if ((arg0 != null) && (arg0.startsWith("edu.yale"))) {
      return;
    }
    this.wrappedSession.removeAttribute(arg0);
  }
  
  public void removeValue(String arg0)
  {
    if ((arg0 != null) && (arg0.startsWith("edu.yale"))) {
      return;
    }
    this.wrappedSession.removeValue(arg0);
  }
  
  public void setAttribute(String arg0, Object arg1)
  {
    if ((arg0 != null) && (arg0.startsWith("edu.yale"))) {
      return;
    }
    this.wrappedSession.setAttribute(arg0, arg1);
  }
}
