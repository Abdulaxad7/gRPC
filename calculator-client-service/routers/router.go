package routers

import (
	"calculator-client-service/pb"
	"context"
	"github.com/gin-gonic/gin"
	"net/http"
)

type numbers struct {
	A      int64  `form:"num1"`
	B      int64  `form:"num2"`
	Sign   string `form:"sign"`
	Result any    `form:"result"`
}

func HomePage(c *gin.Context) {
	c.HTML(http.StatusOK, "home.html", nil)
}

func AddHandlerPost(c *gin.Context) {
	var nums numbers
	if err := c.ShouldBind(&nums); err != nil {
		c.JSON(http.StatusBadRequest, gin.H{"error": err.Error()})
		return
	}
	client := ConfigService()
	if nums.Sign == "+" {
		nums = calculate(nums, c, client)
	} else if nums.Sign == "-" {
		nums = calculate(nums, c, client)
	} else if nums.Sign == "*" {
		nums = calculate(nums, c, client)
	} else if nums.Sign == "/" {
		nums = calculate(nums, c, client)
	}

	data := gin.H{
		"num1":   nums.A,
		"num2":   nums.B,
		"sign":   nums.Sign,
		"result": nums.Result,
	}

	c.HTML(http.StatusOK, "show.html", data)

}

func calculate(nums numbers, c *gin.Context, client pb.BasicCalculatorClient) numbers {
	var err error
	if nums.Sign == "+" {
		req := &pb.AddRequest{
			A: nums.A,
			B: nums.B,
		}
		nums.Result, err = client.Add(context.Background(), req)
	} else if nums.Sign == "-" {
		req := &pb.SubtractRequest{
			A: nums.A,
			B: nums.B,
		}
		nums.Result, err = client.Subtract(context.Background(), req)
	} else if nums.Sign == "*" {
		req := &pb.MultiplyRequest{
			A: nums.A,
			B: nums.B,
		}
		nums.Result, err = client.Multiply(context.Background(), req)
	} else if nums.Sign == "/" {
		req := &pb.DivideRequest{
			A: nums.A,
			B: nums.B,
		}
		nums.Result, err = client.Divide(context.Background(), req)
	}
	if err != nil {
		_ = c.Error(err)
	}
	return nums
}
