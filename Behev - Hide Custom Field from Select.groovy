def CfSerialNumber = getFieldById("customfield_10502")

//def CfCDemo = getFieldById("customfield_10244")
def CfEnv = getFieldById("customfield_10250")


//def conditionB = getFieldById("customfield_10502")
log.debug("Cascade value" + CfSerialNumber.getValue())
 
if (CfEnv.getValue() == "Development") {
    CfSerialNumber.setHidden(false);
    //conditionB.setHidden(true);
} else {
    CfSerialNumber.setHidden(true);
    //conditionB.setHidden(false);
     
}
