package com.gerald.test.statepattern;

public class TCPListen extends TCPState {

  public static TCPState instance() {
    if (tcpState == null) {
      return new TCPListen();
    }
    return tcpState;
  }

  @Override
  public void transmit(TCPConnection tcpConnection, TCPOctetStream tcpOctetStream) {
    super.transmit(tcpConnection, tcpOctetStream);
  }

  @Override
  public void activeOpen(TCPConnection tcpConnection) {
    super.activeOpen(tcpConnection);
  }

  @Override
  public void passiveOpen(TCPConnection tcpConnection) {
    super.passiveOpen(tcpConnection);
  }

  @Override
  public void close(TCPConnection tcpConnection) {
    super.close(tcpConnection);
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
    System.out.println("send SYN, receive SYN, ACT, etc in TCPListen");
    changeState(tcpConnection, TCPEstablished.instance());
  }

  @Override
  protected void changeState(TCPConnection tcpConnection, TCPState tcpState) {
    super.changeState(tcpConnection, tcpState);
  }
}
