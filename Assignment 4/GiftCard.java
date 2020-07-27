package demo;



	public class GiftCard {

		private long cardNo;
		private double balance;
		private boolean active;
		
		public GiftCard() {
			super();
			this.balance=0.0;
		}

		public GiftCard(long cardNo, double balance, boolean active) {
			super();
			this.cardNo = cardNo;
			this.balance = balance;
			this.active = active;
		}
		
		public void rechargeCard (double amount) {
			
			if(this.active==true) {
				this.balance+=amount;
				
			}
			else
			{
				System.out.println("Card is inactive");
			}
		}
		public void swipeCard (double amount) {
			if(this.active==true) {
				if(this.balance>=amount) {
					this.balance-=amount;
					
				}
				else {
					System.out.println("Insufficent Balance");
				}
				
			}
			else {
				System.out.println("Card is inactive");
			}
			
		}

		/**
		 * @return the cardNo
		 */
		public long getCardNo() {
			return cardNo;
		}

		/**
		 * @param cardNo the cardNo to set
		 */
		public void setCardNo(long cardNo) {
			this.cardNo = cardNo;
		}

		/**
		 * @return the balance
		 */
		public double getBalance() {
			return balance;
		}



		/**
		 * @return the active
		 */
		public boolean isActive() {
			return active;
		}

		/**
		 * @param active the active to set
		 */
		public void setActive(boolean active) {
			this.active = active;
		}


	}