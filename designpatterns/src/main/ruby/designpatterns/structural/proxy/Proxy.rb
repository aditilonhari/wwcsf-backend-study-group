require_relative 'SubjectInterface'

# The Proxy has an interface identical to the RealSubject.
class Proxy
  include SubjectInterface
  
  # @param [RealSubject] real_subject
  def initialize(real_subject)
    @real_subject = real_subject
  end

  # The most common applications of the Proxy pattern are lazy loading, caching,
  # controlling the access, logging, etc. A Proxy can perform one of these
  # things and then, depending on the result, pass the execution to the same
  # method in a linked RealSubject object.
  def request
    return unless check_access

    @real_subject.request
    log_access
  end

  # @return [Boolean]
  def check_access
    puts 'Proxy: Checking access prior to firing a real request.'
    true
  end

  def log_access
    print 'Proxy: Logging the time of request.'
  end
end