# The Receiver classes contain some important business logic. They know how to
# perform all kinds of operations, associated with carrying out a request. In
# fact, any class may serve as a Receiver.
class Receiver
  # @param [String] a
  def do_something(a)
    print "\nReceiver: Working on (#{a}.)"
  end

  # @param [String] b
  def do_something_else(b)
    print "\nReceiver: Also working on (#{b}.)"
  end
end
