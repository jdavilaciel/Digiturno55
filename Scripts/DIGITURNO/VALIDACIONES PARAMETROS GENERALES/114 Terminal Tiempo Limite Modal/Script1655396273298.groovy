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

WebUI.click(findTestObject('DIGITURNO/1Principal/img_Configuracion(1)'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/0Principal/img_7Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/0Principal/img_1 Parametros Generales'))

WebUI.delay(3)

'Terminal.TiempoLimiteModal'
WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/input_Busqueda'), 'Terminal.TiempoLimiteModal')

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/img_Filtrar'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/Lista Botones Editar/btn_Editar 1'))

WebUI.delay(2)

'Tiempo en segundos para determinar en cuanto desaparece la ventana modal'
WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/Pestanas/Cambiar Parametros/HHMMSS/input_HHMMSS'), 
    '00:00:10')

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/Pestanas/Cambiar Parametros/HHMMSS/a_Guardar'))

WebUI.delay(3)

'Inicio\r\n\r\n'
WebUI.click(findTestObject('DIGITURNO/1Principal/img_ImageLogo'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/1Principal/img_Operacion(1)'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/0Principal/Elementos del Sistema/img_Terminales'))

WebUI.delay(3)

'Escogemos oficina'
WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/0Oficinas/td_1Bogota - CIEL'))

WebUI.delay(3)

'Abrimos Terminal'
WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/0Terminales (Menos WorkFlow)/td_2 - Terminal - PQRS'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Buscar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Cerrar(1)/btn_4FindeJornada_8'))

WebUI.delay(3)
