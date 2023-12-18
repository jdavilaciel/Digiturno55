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

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/1Principal/img_Configuracion(1)'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/0Principal/img_7Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/0Principal/img_4 Paginas'))

WebUI.delay(3)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/4 Paginas/Lista de Paginas/input_TextoABuscar'), '12')

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/4 Paginas/Lista de Paginas/img_Editar'))

WebUI.delay(3)

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/4 Paginas/Lista de Paginas/img_Editar(1)/label_Es visible'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/4 Paginas/Lista de Paginas/img_Editar(1)/img_icono Actualizar'))

WebUI.delay(5)
