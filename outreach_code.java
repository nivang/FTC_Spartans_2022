package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="Main Gamepad", group="Linear Opmode")

public class FTC_Combined_Gamepad extends LinearOpMode {
    
    // Declare OpMode members.
    
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftFrontDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor leftBackDrive = null;
    private DcMotor rightBackDrive = null;
    private DcMotor intakeMotor = null;
    private DcMotor slideMotor = null;
    private Servo slideServo = null;
    private CRServo duckSpinner = null;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize the hardware variables. Note that the strings used here as parameters
        // to 'get' must correspond to the names assigned during the robot configuration
        // step (using the FTC Robot Controller app on the phone).
        leftFrontDrive  = hardwareMap.get(DcMotor.class, "left_front");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "right_front");
        leftBackDrive  = hardwareMap.get(DcMotor.class, "left_back");
        rightBackDrive = hardwareMap.get(DcMotor.class, "right_back");
        intakeMotor = hardwareMap.get(DcMotor.class, "intake_motor");
        slideMotor = hardwareMap.get(DcMotor.class, "slide_motor");
        slideServo = hardwareMap.get(Servo.class, "slide_servo");
        duckSpinner = hardwareMap.get(CRServo.class, "duck_servo");
        
        // Most robots need the motor on one side to be reversed to drive forward
        // Reverse the motor that runs backwards when connected directly to the battery
    
        leftFrontDrive.setDirection(DcMotor.Direction.FORWARD);
        rightFrontDrive.setDirection(DcMotor.Direction.REVERSE);
        leftBackDrive.setDirection(DcMotor.Direction.FORWARD);
        rightBackDrive.setDirection(DcMotor.Direction.REVERSE);
        intakeMotor.setDirection(DcMotor.Direction.FORWARD);
        slideMotor.setDirection(DcMotor.Direction.REVERSE);
        
        slideServo.setDirection(Servo.Direction.REVERSE);
        duckSpinner.setDirection(DcMotorSimple.Direction.REVERSE);
        
        leftFrontDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightFrontDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftBackDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightBackDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        
        slideMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        //slideMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        
        // Slide Movement
        // slideMotor.setTargetPosition(0);
        // slideMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        // slideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();
        
        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            // Setup a variable for each drive wheel to save power level for telemetry
            double intakePower;
            double slidePower;
            double contPower;
            int slideTarget = 0;
            double boxTarget = 0;

            // Choose to drive using either Tank Mode, or POV Mode
            // Comment out the method that's not used.  The default below is POV.

            // POV Mode uses left stick to go forward, and right stick to turn.
            // This uses basic math to combine motions and is easier to drive straight.
            // Using negative sign for y, x and rx to accuraely map to gamepad stick
            double y = -gamepad1.left_stick_y;
            double x = -gamepad1.left_stick_x * 1.1;
            double rx = -gamepad1.right_stick_x;
            double intake = gamepad2.left_trigger;
            double start_spinner = gamepad2.right_trigger;
            
            // Denominator is the largest motor power (absolute value) or 1
            // This ensures all the powers maintain the same ratio, but only when
            // at least one is out of the range [-1, 1]
            
            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
            double frontLeftPower = (y + x + rx) / denominator;
            double frontRightPower = (y - x - rx) / denominator;
            double backLeftPower = (y - x + rx) / denominator;
            double backRightPower = (y + x - rx) / denominator;
            intakePower   = Range.clip(intake, -0.0, 2.0);
            contPower = Range.clip(start_spinner, -0.0, 2.0);
            contPower = gamepad1.dpad_right?0:contPower;

            leftFrontDrive.setPower(-frontLeftPower * 0.5); //using negative sign to allow joystick forward to move forward
            leftBackDrive.setPower(-backLeftPower * 0.5);
            rightFrontDrive.setPower(-frontRightPower * 0.5);
            rightBackDrive.setPower(-backRightPower * 0.5);
            
            intakeMotor.setPower(intakePower);
            //duckSpinner.setPower(contPower);
            
            // Slide Movement
            if (gamepad2.a) { //sets the bucket in default pickup mode
                slideServo.setPosition(.20);
                //this.runSlideMotorToReset(0, 1.0);
                //this.runSlideMotorToPosition(0);
                //sleep(500);
                this.runSlideMotorToReset(0, 0.0);
            }
            else if (gamepad2.x) { //move slide to level 1
                if(slideMotor.getTargetPosition()==0){
                    slideServo.setPosition(.20);
                    this.runSlideMotorToPosition(150);
                    sleep(500);
                }
                slideServo.setPosition(.30);
                this.runSlideMotorToPosition(220);
            }
            else if (gamepad2.y) { //move slide to level 2
                slideServo.setPosition(.30);
                this.runSlideMotorToPosition(320);
            }
            else if (gamepad2.b) { //move slide to level 3
                slideServo.setPosition(.30);
                this.runSlideMotorToPosition(570);
            }
            else if (gamepad2.right_bumper) { //turns the bucket completely to drop the freight
               slideServo.setPosition(1);
            }
            else if (gamepad2.left_bumper) { //turns the bucket completely to drop the freight
                slideMotor.setTargetPosition(-10);
                slideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                slideMotor.setDirection(DcMotor.Direction.FORWARD);
                slideMotor.setPower(1.0);
            }
            
            
            // Slide motor settings
            //slideMotor.setTargetPosition(slideTarget);
            //slideMotor.setPower(1);
            //slideServo.setPosition(boxTarget);

            // Show the elapsed game time and wheel power.
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Release Servo Target", slideServo.getPosition());
            telemetry.addData("Slide Target", slideMotor.getTargetPosition());
            //telemetry.addData("Slide Position", slideMotor.getPosition());
            telemetry.update();
        }
    }

    private void runSlideMotorToPosition(int positionValue) {
        slideMotor.setTargetPosition(positionValue);
        //slideMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        slideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        // if(positionValue == 0){
        //     slideMotor.setDirection(DcMotor.Direction.FORWARD);
        //     slideMotor.setPower(0.0);
        //     return;
        // }
        slideMotor.setDirection(DcMotor.Direction.REVERSE);
        slideMotor.setPower(1.0);
    }

    private void runSlideMotorToReset(int positionValue, double power) {
        slideMotor.setTargetPosition(positionValue);
        slideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        slideMotor.setDirection(DcMotor.Direction.FORWARD);
        slideMotor.setPower(power);
    }
}
