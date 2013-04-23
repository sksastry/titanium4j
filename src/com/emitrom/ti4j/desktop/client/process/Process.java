/************************************************************************
 * Process.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.desktop.client.process;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * A module for creating processes.
 */
public class Process {

    public static final String SIGABRT = Process.SIGABRT();
    public static final String SIGALRM = Process.SIGALRM();
    public static final String SIGABUS = Process.SIGABUS();
    public static final String SIGCHLD = Process.SIGCHLD();
    public static final String SIGEMT = Process.SIGEMT();
    public static final String SIGFPE = Process.SIGFPE();
    public static final String SIGHUP = Process.SIGHUP();
    public static final String SIGILL = Process.SIGILL();
    public static final String SIGINFO = Process.SIGINFO();
    public static final String SIGINT = Process.SIGINT();
    public static final String SIGIO = Process.SIGIO();
    public static final String SIGKILL = Process.SIGKILL();
    public static final String SIGPIPE = Process.SIGPIPE();
    public static final String SIGPROF = Process.SIGPROF();
    public static final String SIGQUIT = Process.SIGQUIT();
    public static final String SIGSEGV = Process.SIGSEGV();
    public static final String SIGSTOP = Process.SIGSTOP();
    public static final String SIGSYS = Process.SIGSYS();
    public static final String SIGTERM = Process.SIGTERM();
    public static final String SIGTRAP = Process.SIGTRAP();
    public static final String SIGTSTP = Process.SIGTSTP();
    public static final String SIGTTIN = Process.SIGTTIN();
    public static final String SIGTTOU = Process.SIGTTOU();
    public static final String SIGURG = Process.SIGURG();
    public static final String SIGUSR1 = Process.SIGUSR1();
    public static final String SIGUSR2 = Process.SIGUSR2();
    public static final String SIGVTALRM = Process.SIGVTALRM();
    public static final String SIGWINCH = Process.SIGWINCH();
    public static final String SIGXCPU = Process.SIGXCPU();
    public static final String SIGXFSZ = Process.SIGXFSZ();

    private Process() {

    }

    public static native Pipe createPipe()/*-{
		var obj = Ti.Process.createPipe();
		return @com.emitrom.ti4j.desktop.client.process.Pipe::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native ProcessInstance createProcess(JsArrayString arguments)/*-{
		var obj = Ti.Process.createProcess({
			args : arguments
		});
		return @com.emitrom.ti4j.desktop.client.process.ProcessInstance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native ProcessInstance createProcess(JsArrayString arguments, JavaScriptObject environment)/*-{
		var obj = Ti.Process.createProcess({
			args : arguments,
			env : environment
		});
		return @com.emitrom.ti4j.desktop.client.process.ProcessInstance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native ProcessInstance createProcess(JsArrayString arguments, JavaScriptObject environment,
                    Pipe stdinPipe)/*-{
		var obj = Ti.Process
				.createProcess({
					args : arguments,
					env : environment,
					stdin : stdinPipe.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
				});
		return @com.emitrom.ti4j.desktop.client.process.ProcessInstance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native ProcessInstance createProcess(JsArrayString arguments, JavaScriptObject environment,
                    Pipe stdinPipe, Pipe stdoutPipe)/*-{
		var obj = Ti.Process
				.createProcess({
					args : arguments,
					env : environment,
					stdin : stdinPipe.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
					stdout : stdoutPipe.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
				});
		return @com.emitrom.ti4j.desktop.client.process.ProcessInstance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static native ProcessInstance createProcess(JsArrayString arguments, JavaScriptObject environment,
                    Pipe stdinPipe, Pipe stdoutPipe, Pipe stdErrPipe)/*-{
		var obj = Ti.Process
				.createProcess({
					args : arguments,
					env : environment,
					stdin : stdinPipe.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
					stdout : stdoutPipe.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
					stderr : stdErrPipe.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
				});
		return @com.emitrom.ti4j.desktop.client.process.ProcessInstance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native String SIGABRT()/*-{
		return Ti.Process.SIGABRT;
    }-*/;

    private static native String SIGALRM()/*-{
		return Ti.Process.SIGALRM;
    }-*/;

    private static native String SIGABUS()/*-{
		return Ti.Process.SIGABUS;
    }-*/;

    private static native String SIGCHLD()/*-{
		return Ti.Process.SIGCHLD;
    }-*/;

    private static native String SIGEMT()/*-{
		return Ti.Process.SIGEMT;
    }-*/;

    private static native String SIGFPE()/*-{
		return Ti.Process.SIGFPE;
    }-*/;

    private static native String SIGHUP()/*-{
		return Ti.Process.SIGHUP;
    }-*/;

    private static native String SIGILL()/*-{
		return Ti.Process.SIGILL;
    }-*/;

    private static native String SIGINFO()/*-{
		return Ti.Process.SIGINFO;
    }-*/;

    private static native String SIGINT()/*-{
		return Ti.Process.SIGINT;
    }-*/;

    private static native String SIGIO()/*-{
		return Ti.Process.SIGIO;
    }-*/;

    private static native String SIGKILL()/*-{
		return Ti.Process.SIGKILL;
    }-*/;

    private static native String SIGPIPE()/*-{
		return Ti.Process.SIGPIPE;
    }-*/;

    private static native String SIGPROF()/*-{
		return Ti.Process.SIGPROF;
    }-*/;

    private static native String SIGQUIT()/*-{
		return Ti.Process.SIGQUIT;
    }-*/;

    private static native String SIGSEGV()/*-{
		return Ti.Process.SIGSEGV;
    }-*/;

    private static native String SIGSTOP()/*-{
		return Ti.Process.SIGSTOP;
    }-*/;

    private static native String SIGSYS()/*-{
		return Ti.Process.SIGSYS;
    }-*/;

    private static native String SIGTERM()/*-{
		return Ti.Process.SIGTERM;
    }-*/;

    private static native String SIGTRAP()/*-{
		return Ti.Process.SIGTRAP;
    }-*/;

    private static native String SIGTSTP()/*-{
		return Ti.Process.SIGTSTP;
    }-*/;

    private static native String SIGTTIN()/*-{
		return Ti.Process.SIGTTIN;
    }-*/;

    private static native String SIGTTOU()/*-{
		return Ti.Process.SIGTTOU;
    }-*/;

    private static native String SIGURG()/*-{
		return Ti.Process.SIGURG;
    }-*/;

    private static native String SIGUSR1()/*-{
		return Ti.Process.SIGUSR1;
    }-*/;

    private static native String SIGUSR2()/*-{
		return Ti.Process.SIGUSR2;
    }-*/;

    private static native String SIGVTALRM()/*-{
		return Ti.Process.SIGVTALRM;
    }-*/;

    private static native String SIGWINCH()/*-{
		return Ti.Process.SIGWINCH;
    }-*/;

    private static native String SIGXCPU()/*-{
		return Ti.Process.SIGXCPU;
    }-*/;

    private static native String SIGXFSZ()/*-{
		return Ti.Process.SIGXFSZ;
    }-*/;

}
