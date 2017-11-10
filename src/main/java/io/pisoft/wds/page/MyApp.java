package io.pisoft.wds.page;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.IPackageResourceGuard;
import org.apache.wicket.markup.html.SecurePackageResourceGuard;
import org.apache.wicket.protocol.http.WebApplication;

import com.ttdev.wicketpagetest.MockableSpringBeanInjector;

public class MyApp extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

	@Override
	protected void init() {
		super.init();
		enableUTF8Output();
		enableServerFontLoadable();
		mountPage();
		MockableSpringBeanInjector.installInjector(this);
		// configureExceptionHandlers();
	}

	private void mountPage() {

	}

	private void enableUTF8Output() {
		getMarkupSettings().setDefaultMarkupEncoding("utf-8");
	}

	// @Override
	// public Session newSession(Request request, Response response) {
	// return new MySession(request);
	// }

	private void enableServerFontLoadable() {
		IPackageResourceGuard guard = getResourceSettings().getPackageResourceGuard();
		if (guard instanceof SecurePackageResourceGuard) {
			SecurePackageResourceGuard secureGuard = (SecurePackageResourceGuard) guard;
			secureGuard.addPattern("+**.ttf");
			secureGuard.addPattern("+**.eot");
			secureGuard.addPattern("+**.svg");
			secureGuard.addPattern("+**.woff");
		}
	}

	// private void configureExceptionHandlers() {
	// getRequestCycleListeners().add(new AbstractRequestCycleListener() {
	// @Override
	// public IRequestHandler onException(RequestCycle cycle, Exception ex) {
	// Page page = new MyInternalErrorPage(ex);
	// if (ex instanceof PageExpiredException) {
	// page = new SignIn();
	// }
	// return new RenderPageRequestHandler(new PageProvider(page));
	// }
	// });
	// }

}
