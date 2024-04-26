package com.example.dashboardproject.service;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpInterceptors_Factory implements Factory<HttpInterceptors> {
  private static final HttpInterceptors_Factory INSTANCE = new HttpInterceptors_Factory();

  @Override
  public HttpInterceptors get() {
    return provideInstance();
  }

  public static HttpInterceptors provideInstance() {
    return new HttpInterceptors();
  }

  public static HttpInterceptors_Factory create() {
    return INSTANCE;
  }

  public static HttpInterceptors newHttpInterceptors() {
    return new HttpInterceptors();
  }
}
