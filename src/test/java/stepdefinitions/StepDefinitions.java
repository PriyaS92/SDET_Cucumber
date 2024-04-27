package stepdefinitions;

import functionlibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MoviePage;
import pages.Shoppingpage;

public class StepDefinitions{
	
	MoviePage home = new MoviePage();
	Shoppingpage shop = new Shoppingpage();
	
	@Given("I want to login to the movie application portal")
	public void i_want_to_login_to_the_movie_application_portal() {
		home.login_application();
	}

	@When("I want to book a movie")
	public void i_want_to_book_a_movie() {
		try {
			home.ticket_booking();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("would like to make the payment for tickets")
	public void would_like_to_make_the_payment_for_tickets() {
	   home.payment();
	}

	@Given("I want to login to the shopping portal")
	public void i_want_to_login_to_the_shopping_portal() {
	    shop.login_application();
	}

	@When("I add the product to cart")
	public void i_add_the_product_to_cart() {
	   try {
		shop.add_products();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

	@Then("would like to view the product in cart")
	public void would_like_to_view_the_product_in_cart() {
	   try {
		shop.view_products_cart();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

	@Then("I want to remove the item from the cart")
	public void i_want_to_remove_the_item_from_the_cart() {
	   try {
		shop.remove_products();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

}
