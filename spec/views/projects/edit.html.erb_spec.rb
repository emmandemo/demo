require 'rails_helper'

RSpec.describe "projects/edit", type: :view do
  before(:each) do
    @project = assign(:project, Project.create!(
      :title => "MyString",
      :description => "MyText",
      :image_url => "MyString.jpg",
      :estimate => "9.99"
    ))
  end

  it "renders the edit project form" do
    render

    assert_select "form[action=?][method=?]", project_path(@project), "post" do

      assert_select "input#project_title[name=?]", "project[title]"

      assert_select "textarea#project_description[name=?]", "project[description]"

      assert_select "input#project_image_url[name=?]", "project[image_url]"

      assert_select "input#project_estimate[name=?]", "project[estimate]"
    end
  end
end