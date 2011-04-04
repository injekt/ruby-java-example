require 'rbconfig'

unless RUBY_PLATFORM == 'java'
  abort 'Please run with JRuby'
end

desc 'Build JRuby extension'
task :compile do
  classes    = Dir['ext/java/src/hello/*.java']
  jruby_home = Config::CONFIG['prefix']
  jruby_jar  = File.join(jruby_home, 'lib', 'jruby.jar')

  mkdir_p 'pkg/classes'
  sh "javac -classpath #{jruby_jar} -d pkg/classes #{classes.join(' ')}"

  sh "jar cf lib/hello/hello.jar -C pkg/classes ."
end