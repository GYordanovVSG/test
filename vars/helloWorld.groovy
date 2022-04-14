def call(Map config = [:]) {
  bat "echo Hello ${config.name}. It is ${config.dayOfWeek}."
}
