import lombok.extern.java.Log;

@lombok.extern.java.Log
class LoggerJul {
}

@Log
class LoggerJulWithImport {
}

@Log(topic="DifferentName")
class LoggerJulWithDifferentName {
}