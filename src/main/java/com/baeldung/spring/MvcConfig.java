package com.baeldung.spring;

import java.util.Locale;

import javax.annotation.Resource;

import com.baeldung.validation.EmailValidator;
import com.baeldung.validation.PasswordMatchesValidator;

import nz.net.ultraq.thymeleaf.LayoutDialect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
@ComponentScan(basePackages = { "com.baeldung.web" })
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

	public MvcConfig() {
		super();
	}

	@Autowired
	private MessageSource messageSource;

	@Resource
	protected ApplicationContext applicationContext;

	@Resource
	protected SpringTemplateEngine springTemplateEngine;

	@Override
	public void addViewControllers(final ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/login");
		registry.addViewController("/loginRememberMe");
		registry.addViewController("/customLogin");
		registry.addViewController("/registration.html");
		registry.addViewController("/registrationCaptcha.html");
		registry.addViewController("/registrationReCaptchaV3.html");
		registry.addViewController("/logout.html");
		registry.addViewController("/homepage.html");
		registry.addViewController("/expiredAccount.html");
		registry.addViewController("/emailError.html");
		registry.addViewController("/home.html");
		registry.addViewController("/invalidSession.html");
		registry.addViewController("/admin.html");
		registry.addViewController("/successRegister.html");
		registry.addViewController("/forgetPassword.html");
		registry.addViewController("/updatePassword.html");
		registry.addViewController("/changePassword.html");
		registry.addViewController("/users.html");
		registry.addViewController("/qrcode.html");
	}

	@Override
	public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/", "/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
	}

	@Override
	public void addInterceptors(final InterceptorRegistry registry) {
		final LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		registry.addInterceptor(localeChangeInterceptor);
	}

	// beans

	@Bean
	public LocaleResolver localeResolver() {
		final CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
		cookieLocaleResolver.setDefaultLocale(Locale.ENGLISH);
		return cookieLocaleResolver;
	}

	@Bean
	public EmailValidator usernameValidator() {
		return new EmailValidator();
	}

	@Bean
	public PasswordMatchesValidator passwordMatchesValidator() {
		return new PasswordMatchesValidator();
	}

	@Bean
	@ConditionalOnMissingBean(RequestContextListener.class)
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}

	@Override
	public Validator getValidator() {
		LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
		validator.setValidationMessageSource(messageSource);
		return validator;
	}

	@Bean
	WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> enableDefaultServlet() {
		return (factory) -> factory.setRegisterDefaultServlet(true);
	}



	/*  uncomment below code for Theamelef pages in WEB info
	 * 
	 * 
	 * 
	 * @Bean public SpringResourceTemplateResolver thymeleafTemplateResolver(){
	 * final SpringResourceTemplateResolver templateResolver = new
	 * SpringResourceTemplateResolver();
	 * templateResolver.setApplicationContext(applicationContext);
	 * templateResolver.setPrefix("/WEB-INF/thymeleaf/");
	 * templateResolver.setSuffix(".html");
	 * templateResolver.setTemplateMode(TemplateMode.HTML);
	 * templateResolver.setCacheable(false); templateResolver.setOrder(0); return
	 * templateResolver; }
	 */
	 
 // uncomment below code for jsp pages in WEB info
	/*
	 * @Bean public InternalResourceViewResolver jspViewResolver(){ final
	 * InternalResourceViewResolver viewResolver = new
	 * InternalResourceViewResolver(); viewResolver.setViewClass(JstlView.class);
	 * viewResolver.setPrefix("/WEB-INF/jsp/"); viewResolver.setSuffix(".jsp");
	 * viewResolver.setViewNames("jsp/*"); return viewResolver; }
	 * 
	 * 
	 * 
	 * 
	 * @Bean public SpringResourceTemplateResolver jspTemplateResolver(){ final
	 * SpringResourceTemplateResolver templateResolver = new
	 * SpringResourceTemplateResolver();
	 * templateResolver.setApplicationContext(applicationContext);
	 * templateResolver.setPrefix("/WEB-INF/jsp/");
	 * templateResolver.setSuffix(".jsp");
	 * templateResolver.setTemplateMode(TemplateMode.HTML);
	 * templateResolver.setCacheable(false); templateResolver.setOrder(1);
	 * templateResolver.setCharacterEncoding("UTF-8"); return templateResolver; }
	 */	 
}