require_relative 'RealSubject'
require_relative 'Proxy'

# The client code is supposed to work with all objects (both subjects and
# proxies) via the Subject interface in order to support both real subjects and
# proxies. In real life, however, clients mostly work with their real subjects
# directly. In this case, to implement the pattern more easily, you can extend
# your proxy from the real subject's class.
def client_code(subject)
  # ...

  subject.request

  # ...
end

puts 'Client: Executing the client code with a real subject:'
real_subject = RealSubject.new
client_code(real_subject)

puts "\n"

puts 'Client: Executing the same client code with a proxy:'
proxy = Proxy.new(real_subject)
client_code(proxy)
