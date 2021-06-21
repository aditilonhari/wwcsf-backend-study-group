require_relative 'Publisher'
require_relative 'ObserverA'
require_relative 'ObserverB'

# The client code.

publisher = Publisher.new

observer_a = ObserverA.new
publisher.attach(observer_a)

observer_b = ObserverB.new
publisher.attach(observer_b)

publisher.some_business_logic
publisher.some_business_logic

publisher.detach(observer_a)

publisher.some_business_logic