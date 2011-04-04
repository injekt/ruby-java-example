package hello;

import org.jruby.Ruby;
import org.jruby.RubyClass;
import org.jruby.RubyObject;

import org.jruby.runtime.builtin.IRubyObject;
import org.jruby.runtime.ObjectAllocator;

import org.jruby.anno.JRubyMethod;
import org.jruby.anno.JRubyClass;

@JRubyClass(name = "Hello")
public class Hello extends RubyObject {

    public Hello(Ruby runtime, RubyClass klass) {
        super(runtime, klass);
    }

    @JRubyMethod(name = "world")
    public IRubyObject world() {
        return getRuntime().newString("Hello, World!");
    }

}