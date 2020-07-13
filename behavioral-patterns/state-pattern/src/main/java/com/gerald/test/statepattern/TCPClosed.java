package com.gerald.test.statepattern;

public class TCPClosed extends TCPState {

  public static TCPState instance() {
    if (tcpState == null) {
      return new TCPClosed();
    }
    return tcpState;
  }

  @Override
  public void activeOpen(TCPConnection tcpConnection) {
    System.out.println("send SYN, receive SYN, ACT, etc in TCPClosed");
    changeState(tcpConnection, TCPEstablished.instance());
  }

  @Override
  public void passiveOpen(TCPConnection tcpConnection) {
    System.out.println("tcpState in passiveOpen passiveOpen");
    changeState(tcpConnection, TCPListen.instance());
  }

  @Override
  public void transmit(TCPConnection tcpConnection, TCPOctetStream tcpOctetStream) {
    super.transmit(tcpConnection, tcpOctetStream);
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
    super.send(tcpConnection);
  }

  @Override
  protected void changeState(TCPConnection tcpConnection, TCPState tcpState) {
    super.changeState(tcpConnection, tcpState);
  }
}
