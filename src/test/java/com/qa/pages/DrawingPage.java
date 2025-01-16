package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DrawingPage extends MenuPage{

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/signature_pad")
    private WebElement drawingPad;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/saveBtn")
    private WebElement btnSaveDrawing;

    @AndroidFindBy(id = "android:id/message")
    private WebElement msgSuccessfulSave;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private WebElement btnAllowPermission;

    public void drawSimpleLine() {
        drawLine(drawingPad, 333, 777, 700, 999);
    }

    public void pressSaveDrawingBtn(){
        click(btnSaveDrawing);
    }

    public void pressAllowPermissionBtn(){
        click(btnAllowPermission);
    }

    public String getSuccessfulSaveMsg(){
        return msgSuccessfulSave.getText();
    }
}
