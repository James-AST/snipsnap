﻿/* Automatically generated by GenerateWebRoots */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import MyMockLib.MyHttpServletRequest;
import MyMockLib.MyHttpServletResponse;
import java.io.IOException;

class InvokeServlets {
	public static void main(String[] args) throws IOException {
		processServlets();
		processFilters();
		processTags();
	}

	public static void processServlets() {
		// 1. org.snipsnap.net.Layouter
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.Layouter();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2. org.snipsnap.net.PluginServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.PluginServlet();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 3. org.snipsnap.net.CssHandlerServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.CssHandlerServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 4. org.snipsnap.net.ThemeImageServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.ThemeImageServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 5. org.snipsnap.net.FileUploadServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.FileUploadServlet();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 6. org.snipsnap.net.FileDownloadServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.FileDownloadServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 7. org.snipsnap.net.StoreLabelServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.StoreLabelServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 8. org.snipsnap.net.LabelsServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.LabelsServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 9. org.snipsnap.net.SnipViewServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.SnipViewServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 10. org.snipsnap.net.HistoryServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.HistoryServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 11. org.snipsnap.net.SnipVersionServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.SnipVersionServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 12. org.snipsnap.net.DiffServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.DiffServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 13. org.snipsnap.net.RenderServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.RenderServlet();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 14. org.snipsnap.net.NameSpaceServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.NameSpaceServlet();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 15. org.snipsnap.net.RdfServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.RdfServlet();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 16. org.snipsnap.net.SnipRawServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.SnipRawServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 17. org.snipsnap.net.VersionServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.VersionServlet();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 18. org.snipsnap.net.RssServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.RssServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 19. org.snipsnap.net.RsdServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.RsdServlet();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 20. org.snipsnap.net.XmlRpcServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.XmlRpcServlet();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 21. org.snipsnap.net.SnipCopyServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.SnipCopyServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 22. org.snipsnap.net.SnipEditServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.SnipEditServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 23. org.snipsnap.net.SnipLockServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.SnipLockServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 24. org.snipsnap.net.SnipStoreServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.SnipStoreServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 25. org.snipsnap.net.SnipRemoveServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.SnipRemoveServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 26. org.snipsnap.net.SnipSearchServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.SnipSearchServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 27. org.snipsnap.net.PostStoreServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.PostStoreServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 28. org.snipsnap.net.CommentViewServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.CommentViewServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 29. org.snipsnap.net.CommentStoreServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.CommentStoreServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 30. org.snipsnap.net.ChangePasswordServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.ChangePasswordServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 31. org.snipsnap.net.MailPasswordKeyServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.MailPasswordKeyServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 32. org.snipsnap.net.LoginServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.LoginServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 33. org.snipsnap.net.NewUserServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.NewUserServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 34. org.snipsnap.net.iCalServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.iCalServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 35. org.snipsnap.net.RobotServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.RobotServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 36. org.snipsnap.net.admin.ConfigureServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.admin.ConfigureServlet();
			servlet.init();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 37. org.snipsnap.net.admin.ThemeImageServlet
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			HttpServlet servlet = new org.snipsnap.net.admin.ThemeImageServlet();
			servlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public static void processFilters() {
		FilterChain chain = new FilterChain(){
		    public void doFilter(ServletRequest req, ServletResponse resp){
		
		    }
		};

		// 1. org.snipsnap.net.filter.InitFilter
		try {
			HttpServletRequest request   = new MyHttpServletRequest();
			HttpServletResponse response = new MyHttpServletResponse();

			Filter filter = new org.snipsnap.net.filter.InitFilter();
			//filter.init(...);
			filter.doFilter(request, response, chain);
			//filter.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public static void processListeners() {
		// 1. org.snipsnap.user.SessionListener
		try {
			HttpSessionListener listener = new org.snipsnap.user.SessionListener();
			listener.sessionCreated(null);
			listener.sessionDestroyed(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2. org.snipsnap.net.ApplicationContextListener
		try {
			ServletContextListener listener = new org.snipsnap.net.ApplicationContextListener();
			listener.contextInitialized(null);
			listener.contextDestroyed(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public static void processTags() {
		// Processing taglib /WEB-INF/c.tld:
		// 1. org.apache.taglibs.standard.tag.common.core.CatchTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.common.core.CatchTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 2. org.apache.taglibs.standard.tag.common.core.ChooseTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 3. org.apache.taglibs.standard.tag.el.core.OutTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.OutTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 4. org.apache.taglibs.standard.tag.el.core.IfTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.IfTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 5. org.apache.taglibs.standard.tag.el.core.ImportTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.ImportTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 6. org.apache.taglibs.standard.tag.el.core.ForEachTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.ForEachTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 7. org.apache.taglibs.standard.tag.el.core.ForTokensTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.ForTokensTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 8. org.apache.taglibs.standard.tag.common.core.OtherwiseTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 9. org.apache.taglibs.standard.tag.el.core.ParamTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.ParamTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 10. org.apache.taglibs.standard.tag.el.core.RedirectTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.RedirectTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 11. org.apache.taglibs.standard.tag.common.core.RemoveTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.common.core.RemoveTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 12. org.apache.taglibs.standard.tag.el.core.SetTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.SetTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 13. org.apache.taglibs.standard.tag.el.core.UrlTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.UrlTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 14. org.apache.taglibs.standard.tag.el.core.WhenTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.core.WhenTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// Processing taglib /WEB-INF/fmt.tld:
		// 1. org.apache.taglibs.standard.tag.el.fmt.RequestEncodingTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.RequestEncodingTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 2. org.apache.taglibs.standard.tag.el.fmt.SetLocaleTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.SetLocaleTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 3. org.apache.taglibs.standard.tag.el.fmt.TimeZoneTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.TimeZoneTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 4. org.apache.taglibs.standard.tag.el.fmt.SetTimeZoneTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.SetTimeZoneTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 5. org.apache.taglibs.standard.tag.el.fmt.BundleTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.BundleTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 6. org.apache.taglibs.standard.tag.el.fmt.SetBundleTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.SetBundleTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 7. org.apache.taglibs.standard.tag.el.fmt.MessageTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.MessageTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 8. org.apache.taglibs.standard.tag.el.fmt.ParamTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.ParamTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 9. org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 10. org.apache.taglibs.standard.tag.el.fmt.ParseNumberTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.ParseNumberTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 11. org.apache.taglibs.standard.tag.el.fmt.FormatDateTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.FormatDateTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 12. org.apache.taglibs.standard.tag.el.fmt.ParseDateTag
		try {
			TagSupport tag = new org.apache.taglibs.standard.tag.el.fmt.ParseDateTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// Processing taglib /WEB-INF/snipsnap.tld:
		// 1. org.snipsnap.jsp.DebugTag
		try {
			TagSupport tag = new org.snipsnap.jsp.DebugTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 2. org.snipsnap.jsp.CoordinatesTag
		try {
			TagSupport tag = new org.snipsnap.jsp.CoordinatesTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 3. org.snipsnap.jsp.DublinCoreTag
		try {
			TagSupport tag = new org.snipsnap.jsp.DublinCoreTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 4. org.snipsnap.jsp.PathSelectorTag
		try {
			TagSupport tag = new org.snipsnap.jsp.PathSelectorTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 5. org.snipsnap.jsp.PathTag
		try {
			TagSupport tag = new org.snipsnap.jsp.PathTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 6. org.snipsnap.jsp.ContentTag
		try {
			TagSupport tag = new org.snipsnap.jsp.ContentTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 7. org.snipsnap.jsp.BackLinkTag
		try {
			TagSupport tag = new org.snipsnap.jsp.BackLinkTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 8. org.snipsnap.jsp.SnipLinkTag
		try {
			TagSupport tag = new org.snipsnap.jsp.SnipLinkTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 9. org.snipsnap.jsp.UserAuth
		try {
			TagSupport tag = new org.snipsnap.jsp.UserAuth();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 10. org.snipsnap.jsp.CheckPermission
		try {
			TagSupport tag = new org.snipsnap.jsp.CheckPermission();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 11. org.snipsnap.jsp.ObjectAuth
		try {
			TagSupport tag = new org.snipsnap.jsp.ObjectAuth();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 12. org.snipsnap.jsp.SnipTag
		try {
			TagSupport tag = new org.snipsnap.jsp.SnipTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
		// 13. org.snipsnap.jsp.ImageTag
		try {
			TagSupport tag = new org.snipsnap.jsp.ImageTag();
			tag.doStartTag();
		} catch (JspException e){e.printStackTrace();}
	}

}

