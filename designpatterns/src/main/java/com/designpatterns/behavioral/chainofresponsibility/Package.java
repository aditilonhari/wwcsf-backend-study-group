package com.designpatterns.behavioral.chainofresponsibility;

public class Package {

  private String packageId;
  // Other package details

  public Package(String packageId) {
    this.packageId = packageId;
  }

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }
}