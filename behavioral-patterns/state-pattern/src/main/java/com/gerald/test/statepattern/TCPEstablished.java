package com.gerald.test.statepattern;

public class TCPEstablished extends TCPState {

  public static TCPState instance() {
    if (tcpState == null) {
      return new TCPEstablished();
    }
    return tcpState;
  }

  @Override
  public void close(TCPConnection tcpConnection) {
    System.out.println("tcpState in TCPEstablished close");
    changeState(tcpConnection, TCPClosed.instance());
  }

  @Override
  public void synchronize(TCPConnection tcpConnection) {
    super.synchronize(tcpConnection);
  }

  @Override
  public void acknowledge(TCPConnection tcpConnection) {
    super.acknowledge(tcpConnection);
  }

  @Override
  public void send(TCPConnection tcpConnection) {
    super.send(tcpConnection);
  }

  @Override
  protected void changeState(TCPConnection tcpConnection, TCPState tcpState) {
    super.changeState(tcpConnection, tcpState);
  }

  @Override
  public void transmit(TCPConnection tcpConnection, TCPOctetStream tcpOctetStream) {
    System.out.println("TCPEstablished transmit");
    tcpConnection.processOctet(tcpOctetStream);
  }

  @Override
  public void activeOpen(TCPConnection tcpConnection) {
    super.activeOpen(tcpConnection);
  }

  @Override
  public void passiveOpen(TCPConnection tcpConnection) {
    super.passiveOpen(tcpConnection);
  }
}
