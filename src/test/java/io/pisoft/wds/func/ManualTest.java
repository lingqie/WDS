package io.pisoft.wds.func;

import com.ttdev.wicketpagetest.WebAppJettyConfiguration;
import com.ttdev.wicketpagetest.WebAppJettyLauncher;

public class ManualTest {
	public static void main(String[] args) {
		WebAppJettyLauncher launcher = new WebAppJettyLauncher();
		WebAppJettyConfiguration cfg = new WebAppJettyConfiguration();
		launcher.startAppInJetty(cfg);
	}
}
