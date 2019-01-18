package org.robolectric.internal;

import java.lang.reflect.Method;
import org.robolectric.ApkLoader;
import org.robolectric.annotation.Config;
import org.robolectric.manifest.AndroidManifest;
import org.robolectric.pluginapi.Sdk;

public interface ParallelUniverseInterface {

  void setSdk(Sdk sdk);

  void setResourcesMode(boolean legacyResources);

  void setUpApplicationState(
      ApkLoader apkLoader, Method method,
      Config config, AndroidManifest appManifest,
      SdkEnvironment sdkEnvironment);

  Thread getMainThread();

  void setMainThread(Thread newMainThread);

  void tearDownApplication();

  Object getCurrentApplication();

}
