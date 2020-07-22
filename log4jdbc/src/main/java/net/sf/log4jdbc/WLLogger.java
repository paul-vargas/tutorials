package net.sf.log4jdbc;

import weblogic.i18n.logging.LogMessage;
import weblogic.i18n.logging.MessageLogger;
import weblogic.i18n.logging.MessageLoggerRegistry;
import weblogic.i18n.logging.MessageLoggerRegistryListener;
import weblogic.i18n.logging.Severities;

public class WLLogger implements MessageLoggerRegistryListener {
	private String name;
	private MessageLogger messageLogger;

	public WLLogger(final String name) {
		this.name = name;
		this.initMessageLogger();
		MessageLoggerRegistry.addMessageLoggerRegistryListener(this);
	}

	public void error(final String msg) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.ERROR, msg));
	}

	public void error(final String msg, final Throwable throwable) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.ERROR, msg, throwable));
	}

	public void warning(final String msg) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.WARNING, msg));
	}

	public void warning(final String msg, final Throwable throwable) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.WARNING, msg, throwable));
	}

	public void info(final String msg) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.INFO, msg));
	}

	public void info(final String msg, final Throwable throwable) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.INFO, msg, throwable));
	}

	public void debug(final String msg) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.DEBUG, msg));
	}

	public void debug(final String msg, final Throwable throwable) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.DEBUG, msg, throwable));
	}

	public void alert(final String msg) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.ALERT, msg));
	}

	public void alert(final String msg, final Throwable throwable) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.ALERT, msg, throwable));
	}

	public void critical(final String msg) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.CRITICAL, msg));
	}

	public void critical(final String msg, final Throwable throwable) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.CRITICAL, msg, throwable));
	}

	public void emergency(final String msg) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.EMERGENCY, msg));
	}

	public void emergency(final String msg, final Throwable throwable) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.EMERGENCY, msg, throwable));
	}

	public void notice(final String msg) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.NOTICE, msg));
	}

	public void notice(final String msg, final Throwable throwable) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.NOTICE, msg, throwable));
	}

	public void trace(final String msg) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.TRACE, msg));
	}

	public void trace(final String msg, final Throwable throwable) {
		this.messageLogger.log(new LogMessage("", "", this.name, Severities.TRACE, msg, throwable));
	}

	public void messageLoggerRegistryUpdated() {
		this.initMessageLogger();
	}

	private void initMessageLogger() {
		this.messageLogger = MessageLoggerRegistry.findMessageLogger(this.name);
	}

	public boolean isErrorEnabled() {
		return messageLogger.isSeverityEnabled(this.name, Severities.ERROR);
	}

	public boolean isDebugEnabled() {
		return messageLogger.isSeverityEnabled(this.name, Severities.DEBUG);
	}

	public boolean isInfoEnabled() {
		return messageLogger.isSeverityEnabled(this.name, Severities.INFO);
	}

	public boolean isWarnEnabled() {
		return messageLogger.isSeverityEnabled(this.name, Severities.WARNING);
	}
}