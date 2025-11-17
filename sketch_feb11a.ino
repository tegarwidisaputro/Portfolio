#include <WiFi.h>

const char* ssid = "TEGAR";
const char* password = "12345678";

void setup() {
  Serial.begin(115200);

  // Mode Access Point (AP)
  WiFi.mode(WIFI_AP);
  WiFi.softAP(ssid, password);

  pinMode(2, OUTPUT); // Menggunakan GPIO2 sebagai output
  Serial.println("Access Point Started");
}

void loop() {
  int numClients = WiFi.softAPgetStationNum(); // Mendapatkan jumlah klien yang terhubung
  Serial.print("Clients connected: ");
  Serial.println(numClients);

  if (numClients > 0) {
    digitalWrite(2, HIGH); // Nyalakan LED atau perangkat lain di GPIO2
  } else {
    digitalWrite(2, LOW);  // Matikan jika tidak ada klien yang terhubung
  }

  delay(1000); // Delay 1 detik untuk stabilitas loop
}
