require_relative 'Command'

# Some commands can implement simple operations on their own.
class SimpleCommand < Command
  # @param [String] payload
  def initialize(payload)
    @payload = payload
  end

  def execute
    puts "SimpleCommand: See, I can do simple things like printing (#{@payload})"
  end
end