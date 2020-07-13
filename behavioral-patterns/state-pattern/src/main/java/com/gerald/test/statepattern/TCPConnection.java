package com.gerald.test.statepattern;

import lombok.Getter;

@Getter
public class TCPConnection {

  TCPState tcpState;

  public TCPConnection() {
    tcpState = new TCPClosed();
  }

  void changeState(TCPState tcpState) {
    this.tcpState = tcpState;
    System.out.println("tcpConnection tcpState changed to: " + tcpState.getClass().getTypeName());
    System.out.println("==========================================");
  }

  void activeOpen() {
    System.out.println("tcpConnection is calling activeOpen");
    tcpState.activeOpen(this);
  }

  void passiveOpen() {
    System.out.println("tcpConnection is calling passiveOpen");
    tcpState.passiveOpen(this);
  }

  void close() {
    System.out.println("tcpConnection is calling close");
    tcpState.close(this);
  }

  void send() {
    System.out.println("tcpConnection is calling send");
    tcpState.send(this);
  }

  void acknowledge() {
    System.out.println("tcpConnection is calling acknowledge");
    tcpState.acknowledge(this);
  }

  void synchronize() {
    System.out.println("tcpConnection is calling synchronize");
    tcpState.synchronize(this);
  }

  void processOctet(TCPOctetStream tcpOctetStream) {
    System.out.println("process OctetStream in TCPConnection");
  }
}
