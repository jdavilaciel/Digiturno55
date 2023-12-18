import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('0InicioSesion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('WIZARD/0Principal/img_EstructuraGeograficaMAX'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/0Arbol Geografico/span_Elementos geograficos'))

WebUI.delay(3)

'Para crear departamento 1'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Departamento'))

WebUI.delay(3)

'Ingresamos Cundinamarca'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Cundinamarca')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear departamento 2'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Departamento'))

WebUI.delay(3)

'Ingresamos Valle del Cauca'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Valle del Cauca')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear departamento 3'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Departamento'))

WebUI.delay(3)

'Ingresamos Bolivar'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Bolivar')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear departamento 4'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Departamento'))

WebUI.delay(3)

'Ingresamos Caldas'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Caldas')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear departamento 5'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Departamento'))

WebUI.delay(3)

'Ingresamos Dpto Virtual'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Dpto Virtual')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear departamento 6'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Departamento'))

WebUI.delay(3)

'Ingresamos Dpto WorkFlow'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Dpto WorkFlow')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear departamento 7'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Departamento'))

WebUI.delay(3)

'Ingresamos Antioquia'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Antioquia')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)
