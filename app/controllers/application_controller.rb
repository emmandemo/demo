class ApplicationController < ActionController::Base
  # Prevent CSRF attacks by raising an exception.
   # For APIs, you may want to use :null_session instead.
  protect_from_forgery with: :exception
   #protect_from_forgery with: :null_session


  before_filter :configure_permitted_parameters, if: :devise_controller?

  protected

   def configure_permitted_parameters
     devise_parameter_sanitizer.permit(:sign_up) do |u| u.permit(:first_name, :last_name, :email, :password, :password_confirmation) 
     end
     devise_parameter_sanitizer.permit(:account_update) do |u| u.permit(:first_name, :last_name, :email, :password, :password_confirmation) 
     end
   end

  def require_user
    if !user_signed_in?
    flash[:danger] = "You must sign in to continue"
    redirect_to charity_path
    end
  end
  
   def require_admin_user
    unless current_user.admin?
     flash[:danger] = "Only admins can perform this action"
     redirect_to charity_path
    end
   end

    def project_params
      params.require(:project).permit(:title, :description, :contact_email, :estimate, :picture, :user, :slug, :url, :start_date, :end_date, :closes_at, :opens_at, :custom_fields, :review_tags, :state)
    end


    def invalid_path
      logger.error "Attempt to access invalid path #{params[:id]}"
      #redirect_to charity_url, notice: 'Invalid path'
      flash[:danger] = "You are trying to access invalid path"
      redirect_to charity_url
    end


end
