# The ObserverInterface declares the update method, used by publishers.
module ObserverInterface
  # Receive update from publisher.
  def update(_publisher)
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end
end