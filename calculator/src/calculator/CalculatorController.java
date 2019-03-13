package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;


public class CalculatorController implements Initializable{

    @FXML private Label firstInput;
    @FXML private Label secondInput;
    @FXML private Label showResult;
    @FXML private Label showOperator;


    Stack <Character>inputStack ;

    StringBuffer firstInputStr;
    StringBuffer secondInputStr;

    char operator;

    boolean isChanged = false;

    int result;     //store result


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        firstInputStr = new StringBuffer();
        secondInputStr = new StringBuffer();
        inputStack = new <Character>Stack();
    }



    /*
    *   number button action code  is below here:
    * */

    @FXML protected void pressNumZero(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('0');
        else
            secondInputStr.append('0');

        inputStack.push('0');
        putStrToLabel();


    }
    @FXML protected void pressNumOne(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('1');
        else
            secondInputStr.append('1');

        inputStack.push('1');
        putStrToLabel();

    }
    @FXML protected void pressNumTwo(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('2');
        else
            secondInputStr.append('2');

        inputStack.push('2');
        putStrToLabel();
    }

    @FXML protected void pressNumThree(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('3');
        else
            secondInputStr.append('3');

        inputStack.push('3');
        putStrToLabel();

    }
    @FXML protected void pressNumFour(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('4');
        else
            secondInputStr.append('4');

        inputStack.push('4');
        putStrToLabel();
    }
    @FXML protected void pressNumFive(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('5');
        else
            secondInputStr.append('5');

        inputStack.push('5');
        putStrToLabel();
    }
    @FXML protected void pressNumSix(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('6');
        else
            secondInputStr.append('6');

        inputStack.push('6');
        putStrToLabel();
    }
    @FXML protected void pressNumSeven(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('7');
        else
            secondInputStr.append('7');

        inputStack.push('7');
        putStrToLabel();
    }
    @FXML protected void pressNumEight(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('8');
        else
            secondInputStr.append('8');

        inputStack.push('8');
        putStrToLabel();
    }
    @FXML protected void pressNumNine(ActionEvent event){
        if (!isChanged)
            firstInputStr.append('9');
        else
            secondInputStr.append('9');

        inputStack.push('9');
        putStrToLabel();
    }

    /*
    *       operator button action code is below here;
    *
    * */

    @FXML protected void pressOperatorAdd(ActionEvent event){
        operator = '+';
        inputStack.push('+');
        showOperator.setText("+");
        isChanged = true;

    }
    @FXML protected void pressOperatorMinus(ActionEvent event){
        operator = '-';
        inputStack.push('-');
        showOperator.setText("-");
        isChanged = true;
    }
    @FXML protected void pressOperatorMultiply(ActionEvent event){
        operator = '*';
        inputStack.push('*');
        showOperator.setText("*");
        isChanged = true;
    }
    @FXML protected void pressOperatorDivide(ActionEvent event){
        operator = '/';
        inputStack.push('/');
        showOperator.setText("/");
        isChanged = true;
    }
    @FXML protected void pressOperatorMod(ActionEvent event){
        operator = '%';
        inputStack.push('%');
        showOperator.setText("%");
        isChanged = true;
    }


    /*
    *       function key action code is below here
    * */
    @FXML protected void pressFunckeyDel(ActionEvent event){
        if (inputStack.empty()){
            clearCache();
            updateDisplay();
            return;
        }


        if ( (int)(inputStack.peek()) >= (int)('0')  && (int)(inputStack.peek()) <= (int)('9')){
            if (!isChanged)
                firstInputStr.deleteCharAt( firstInputStr.length() - 1 );
            else
                secondInputStr.deleteCharAt( secondInputStr.length() - 1 );
        }else {
            showOperator.setText("");
            isChanged = false;
        }

        inputStack.pop();
        updateDisplay();

    }

    @FXML protected void pressFunckeyClear(ActionEvent event){
        clearCache();
        updateDisplay();
    }


    /*
    *       press '=' button get RESULT
    * */
    @FXML protected void getResult(ActionEvent event){
        int first = Integer.parseInt(firstInputStr.toString());
        int second = Integer.parseInt(secondInputStr.toString());

        switch (operator){
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                if (0 == second)
                    break;
                result = first / second;
                break;
            case '%' :
                result = first % second;
                break;
        }
        showResult.setText(result+"");

        //清空各种参数的缓存
        clearCache();
    }



    /*
    *       extra method
    *
    * */

    void putStrToLabel(){
        firstInput.setText(firstInputStr.toString());
        secondInput.setText(secondInputStr.toString());
    }

    void updateDisplay(){
        if (inputStack.empty()){
            setDisplayNull();
            return;
        }

        firstInput.setText(firstInputStr.toString());
        secondInput.setText(secondInputStr.toString());
        showOperator.setText(operator+"");
        if ( 0 == result )
            showResult.setText("");
        else
            showResult.setText(result+"");

    }


    void clearCache(){
        isChanged = false;
        firstInputStr.delete( 0,(firstInputStr.length()) );
        secondInputStr.delete( 0, (secondInputStr.length()));
        result = 0;

        while(!inputStack.empty()){
            inputStack.pop();
            System.out.println(inputStack.toString());
        }

    }

    void setDisplayNull(){
        firstInput.setText("");
        secondInput.setText("");
        showOperator.setText("");
        showResult.setText("");

    }





}
