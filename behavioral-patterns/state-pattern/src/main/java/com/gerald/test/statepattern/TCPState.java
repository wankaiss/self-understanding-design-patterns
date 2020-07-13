package com.gerald.test.statepattern;

public class TCPState {

  protected static TCPState tcpState;

  public void transmit(TCPConnection tcpConnection, TCPOctetStream tcpOctetStream) {
    System.out.println("default tcpState transmit");
  }

  public void activeOpen(TCPConnection tcpConnection) {
    System.out.println("default tcpState activeOpen");
  }

  public void passiveOpen(TCPConnection tcpConnection) {
    System.out.println("default tcpState passiveOpen");
  }

  public void close(TCPConnection tcpConnection) {
    System.out.println("default tcpState close");
  }

  public void synchronize(TCPConnection tcpConnection) {
    System.out.println("default tcpState synchronize");
  }

  public void acknowledge(TCPConnection tcpConnection) {
    System.out.println("default tcpState acknowledge");
  }

  public void send(TCPConnection tcpConnection) {
    System.out.println("default tcpState send");
  }

  protected void changeState(TCPConnection tcpConnection, TCPState tcpState) {
    System.out.println(
        "tcpState is from: "
            + tcpConnection.getTcpState().getClass().getTypeName()
            + " changing to: "
            + tcpState.getClass().getTypeName());
    tcpConnection.changeState(tcpState);
  }
}
