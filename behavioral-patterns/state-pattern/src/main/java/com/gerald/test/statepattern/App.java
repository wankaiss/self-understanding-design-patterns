package com.gerald.test.statepattern;

public class App {
  public static void main(String[] args) {
    TCPConnection tcpConnection = new TCPConnection();
    tcpConnection.processOctet(new TCPOctetStream());
    tcpConnection.activeOpen();
    tcpConnection.close();
    tcpConnection.passiveOpen();
    tcpConnection.send();
    tcpConnection.close();
  }
}
